/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clima;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

/**
 *
 * @author developer
 */
public class ClimaTempo {
    
    private static final String LINK = "http://apiadvisor.climatempo.com.br/api/v1/forecast/locale/3477/hours/72?token=<COLOCAR O TOKEN>";
    
    public static void main(String[] args) {
        RespostaClima resposta = getClima();
        if (resposta != null) {
            System.out.print("ID da cidade: ");
            System.out.println(resposta.getId());
            
            System.out.print("Nome da cidade: ");
            System.out.println(resposta.getName());
            
            System.out.print("Estado: ");
            System.out.println(resposta.getState());
            
            System.out.print("Pais: ");
            System.out.println(resposta.getCountry());
            
            for (int i = 0; i < resposta.getData().length; i++) {
                System.out.print("Previsão do dia: ");
                System.out.println(resposta.getData()[i].getDate_br());
                
                System.out.print("Precipitação: ");
                System.out.println(resposta.getData()[i].getRain().getPrecipitation()+" mm");
                
                System.out.print("Ventos: ");
                System.out.print(resposta.getData()[i].getWind().getVelocity()+" km/h ");
                System.out.print(resposta.getData()[i].getWind().getDirection_degrees()+"° ");
                System.out.println(resposta.getData()[i].getWind().getDirection());
                
                System.out.print("Temperatura: ");
                System.out.println(resposta.getData()[i].getTemperature().getTemperature()+"°C");
            }
        }
        
    }
    
    private static RespostaClima getClima() {
        Gson gson = new Gson();
        
        try {
            URL url = new URL(LINK);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            InputStream inputStream = conexao.getInputStream();
            String Json = new BufferedReader(new InputStreamReader(inputStream))
                            .lines().collect(Collectors.joining("\n"));
            
           RespostaClima clima = gson.fromJson(Json,RespostaClima.class);
           return clima;
        } catch(IOException e){
            System.out.println(e.getCause().getMessage());
        }
        
        return null; 
    }
}
