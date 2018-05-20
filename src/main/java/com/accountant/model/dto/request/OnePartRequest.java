package com.accountant.model.dto.request;

import com.accountant.entity.StatetableEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OnePartRequest {
    private int id;
    private String ordr;
    private String part;
    private String currentState;
    private int quantity;
}
