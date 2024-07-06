package com.projects.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class LoansDto {

    @NotEmpty(message = "Mobile Number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits")
    @Schema(
            description = "Mobile Number of Customer", example = "2345679890"
    )
    private String mobileNumber;

    @NotEmpty(message = "Loan Number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Loan Number must be 12 digits")
    @Schema(
            description = "Loan Number of Customer", example = "553344229988"
    )

    private String loanNumber;

    @NotEmpty(message = "LoanType cannot be null or empty")
    @Schema(
            description = "Type of Loan", example = "Car Loan"
    )
    private String loanType;

    @Positive(message = "Total loan amount should be greater than zero")
    @Schema(
            description = "Total loan amount", example = "100000"
    )
    private  int totalLoan;

    @PositiveOrZero(message = "Total loan amount paid should be equal or greater than zero")
    @Schema(
            description = "Total loan amount paid", example = "1000"
    )
    private int amountPaid;

    @PositiveOrZero(message = "Total outstanding amount should be equal or greater than zero")
    @Schema(
            description = "Total outstanding amount against a loan", example = "99000"
    )
    private int outstandingAmount;
}
