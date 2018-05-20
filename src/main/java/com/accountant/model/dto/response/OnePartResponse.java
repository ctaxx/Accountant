package com.accountant.model.dto.response;

import com.accountant.entity.StatetableEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OnePartResponse {
    private StatetableEntity part;
}
