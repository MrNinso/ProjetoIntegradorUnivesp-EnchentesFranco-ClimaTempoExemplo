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
public class RespostaClima {
    private float id;
    private String name, state, country;
    private Data[] data;

    public RespostaClima(float id, String name, String state, String country, Data[] data) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.country = country;
        this.data = data;
    }

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public Data[] getData() {
        return data;
    }
    
    
}
