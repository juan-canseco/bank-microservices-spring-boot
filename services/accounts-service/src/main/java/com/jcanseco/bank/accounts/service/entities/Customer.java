package com.jcanseco.bank.accounts.service.entities;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table
@Entity(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "full_name", length = 50, nullable = false)
    private String fullName;

    @Column(name = "cell_phone", length = 15, nullable = false)
    private String cellPhone;

    @Column(name = "email", length = 75, nullable = false)
    private String email;

    @OneToMany(mappedBy = "customers", fetch = FetchType.LAZY)
    private List<Account> accounts;

    @CreatedDate
    @Column(name = "created_at")
    private LocalDate createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDate updatedAt;

    @Column(name = "active", nullable = false)
    private boolean active = true;
}
