/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author LEONARDO
 */
public class Read { //fazendo leitura do arquivo
    public String Read(String caminho) throws FileNotFoundException, IOException{
        BufferedReader  out = new BufferedReader(new FileReader(caminho));
        String str = "";
        String text = "";
        while((str = out.readLine()) != null){
            text += str+"\n";
        }
        return text;
    }
    
}
