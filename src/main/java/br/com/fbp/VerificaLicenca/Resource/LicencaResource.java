/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbp.VerificaLicenca.Resource;

import br.com.fbp.VerificaLicenca.Model.Licenca;
import br.com.fbp.VerificaLicenca.Repository.Licencas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author F.Belmonte
 */
@RestController
@RequestMapping("/licenca")
public class LicencaResource {

    @Autowired
    private Licencas licencas;

    @GetMapping
    public Licenca retornaLicenca() {
        return licencas.findById(1L).get();
    }

    @PostMapping
    public Licenca criar(@RequestBody Licenca licenca) {
        return licencas.save(licenca);
    }

    @PutMapping("/{id}")
    public Licenca atualizar(@PathVariable Long id, @RequestBody Licenca licenca) {
        Licenca licencaBanco =  licencas.findById(id).get();
        licencaBanco.setLicenciado(licenca.isLicenciado());
        return licencas.save(licencaBanco);
    }
}
