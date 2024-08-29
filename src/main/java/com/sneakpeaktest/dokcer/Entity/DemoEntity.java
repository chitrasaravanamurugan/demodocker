package com.sneakpeaktest.dokcer.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemoEntity {
    @Id
    private int id;
    private String name;
    private String address;
}
