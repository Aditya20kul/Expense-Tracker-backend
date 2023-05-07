package com.aditya20kul.expenseapp.models;


import com.aditya20kul.expenseapp.enums.CategoryEnum;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name="expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String expenseTitle;
    private String expenseDescription;
    private double amount;
    private LocalDate expenseDate;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "CategoryEnum", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
    private List<CategoryEnum> expenseCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
//    @LastModifiedDate
//    private LocalDateTime lastModified;
}
