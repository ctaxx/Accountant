package com.accountant.model.dto.response;

import com.accountant.entity.StatetableEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShowAllPartsResponse {
    List<StatetableEntity> listOfAll;
}
