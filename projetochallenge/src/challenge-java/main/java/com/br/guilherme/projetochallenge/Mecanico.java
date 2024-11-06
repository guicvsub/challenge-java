/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.guilherme.projetochallenge;

/**
 *
 * @author gui
 */
public class Mecanico extends Pessoa {
    private String id;
    private String especialidade;
    private String localidade;
    private String experiencia;

    public Mecanico(String nome, String email, String telefone,String especialidade, String localidade,String experiencia) {
        super(nome, email, telefone);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getExperiencia() {
        return experiencia;
        
    }
    
}
