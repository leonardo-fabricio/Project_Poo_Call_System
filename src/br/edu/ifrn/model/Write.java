/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LEONARDO
 */
public class Write{ //escrita dos bytes no arquivo 
    public void writeC(Contato str,String caminho) throws FileNotFoundException, IOException{
        File DadosCadastrados = new File(caminho);
        FileWriter fw = new FileWriter(DadosCadastrados,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(str.getNome()+","+str.getEnd()+","+str.getCidade()+","
                +str.getDataNascimento()+","+str.getFone()+","+str.getCell()+"\n");
        bw.close();
        fw.close();
    }
    
    public void writeU(Usuario str,String caminho) throws FileNotFoundException, IOException{
        File DadosCadastrados = new File(caminho);
        FileWriter fw = new FileWriter(DadosCadastrados,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(str.getNome()+","+str.getLogin()+","+str.getSenha()+","+str.getTipoDeUsuario()+"#\n");
        bw.close();
        fw.close();
    }
}
