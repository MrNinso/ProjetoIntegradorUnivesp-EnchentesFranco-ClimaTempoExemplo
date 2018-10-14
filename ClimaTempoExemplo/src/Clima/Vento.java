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
public class Vento {
    private float velocity,directiondegrees,gust;
    private String direction;

    public Vento(float velocity, float direction_degrees, float gust, String direction) {
        this.velocity = velocity;
        this.directiondegrees = direction_degrees;
        this.gust = gust;
        this.direction = direction;
    }

    public float getVelocity() {
        return velocity;
    }

    public float getDirection_degrees() {
        return directiondegrees;
    }

    public float getGust() {
        return gust;
    }

    public String getDirection() {
        return direction;
    }
    
    
}
