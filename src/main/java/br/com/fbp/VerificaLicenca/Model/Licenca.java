/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbp.VerificaLicenca.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author F.Belmonte
 */
@Entity
@Data
public class Licenca {
    @Id
    private Long id;
    
    private boolean licenciado;
}
