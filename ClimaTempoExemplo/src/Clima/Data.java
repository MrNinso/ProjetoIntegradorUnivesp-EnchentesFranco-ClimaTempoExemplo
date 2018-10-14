/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clima;

/**
 *
 * @author developer
 */
public class Data {
    private String date,date_br;
    private Chuva rain;
    private Vento wind;
    private Temperatura temperature;

    public Data(String date, String date_br, Chuva rain, Vento wind, Temperatura temperature) {
        this.date = date;
        this.date_br = date_br;
        this.rain = rain;
        this.wind = wind;
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public String getDate_br() {
        return date_br;
    }

    public Chuva getRain() {
        return rain;
    }

    public Vento getWind() {
        return wind;
    }

    public Temperatura getTemperature() {
        return temperature;
    }
    
    
}
