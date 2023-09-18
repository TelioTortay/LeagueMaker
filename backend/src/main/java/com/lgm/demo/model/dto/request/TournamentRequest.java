package com.lgm.demo.model.dto.request;

import com.lgm.demo.model.validation.annotation.CustomCompetitionNameValidator;
import com.lgm.demo.model.validation.annotation.CustomNameValidator;
import com.lgm.demo.model.validation.annotation.CustomNumberOfCompetitorsInTournamentValidator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TournamentRequest {
    @CustomNumberOfCompetitorsInTournamentValidator
    private Integer numberOfCompetitors;
    @CustomCompetitionNameValidator
    private String tournamentName;
}
