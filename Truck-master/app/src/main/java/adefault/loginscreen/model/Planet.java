package adefault.loginscreen.model;

import java.io.Serializable;

public class Planet implements Serializable {
    public String name;
    public String rotationPeriod;
    public String climate;
    public String population;
    public String getName()
    {
        return name;
    }
    public void setName(String name){

        this.name = name;

    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    @Override
    public String toString() {
        return /*"Planet{" +
                "name='" + */name  ;
               // ", rotationPeriod='" + rotationPeriod + '\'' +
                //", climate='" + climate + '\'' +
                //", population='" + population + '\'' +
                //'}' ;
    }
}
