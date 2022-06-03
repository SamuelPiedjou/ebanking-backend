package org.sid.ebankingbackend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ebankingbackend.entities.BankAccount;
import org.sid.ebankingbackend.enums.Identification;
import org.sid.ebankingbackend.enums.Sexe;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
    private Date birthday;
    private String nationality;
    private Identification identification;
    private Sexe sexe;
    private String zipCode;
    private String phone;
}
