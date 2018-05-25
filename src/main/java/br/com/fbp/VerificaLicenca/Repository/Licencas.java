/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbp.VerificaLicenca.Repository;

import br.com.fbp.VerificaLicenca.Model.Licenca;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author F.Belmonte
 */
public interface Licencas extends JpaRepository<Licenca, Long> {

}
