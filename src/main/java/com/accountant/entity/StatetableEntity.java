package com.accountant.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "statetable")
public class StatetableEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "ordr", nullable = false, length = 20)
    private String ordr;
    @Basic
    @Column(name = "part", nullable = true, length = 30)
    private String part;
    @Basic
    @Column(name = "quantity", nullable = true)
    private Integer quantity;
    @Basic
    @Column(name = "current_state", nullable = true, length = 20)
    private String currentState;

}
