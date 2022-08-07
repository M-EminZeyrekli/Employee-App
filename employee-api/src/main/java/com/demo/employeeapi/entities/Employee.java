package com.demo.employeeapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter ve setterları bizim için getiriyor
@NoArgsConstructor // parametresiz contructor oluşturuyor
@AllArgsConstructor // parametreli contructor oluşturuyor
@Entity // veri tabanı nesnesi
@Table(name = "employees") // veri tabanında employees tablosu oluşturma

public class Employee {

    @Id
    @GeneratedValue // id yi otomatik olarak arttırmaya yarıyor.
    @Column(name = "id")
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

}
