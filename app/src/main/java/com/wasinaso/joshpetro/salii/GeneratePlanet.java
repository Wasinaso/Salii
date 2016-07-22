package com.wasinaso.joshpetro.salii;

/**
 * Created by Josh Petro on 7/21/2016.
 */
public class GeneratePlanet {

    public static abstract class NewPlanetInfo
    {
        public static final String PLANET_NAME = "planet_name";
        public static final String PLAYER_NAME = "player_name";

        //Start Hardcoded values
        //// // TODO: 7/21/2016 generate these values within specific ranges based on information given
        public static final Boolean PLANET_HABITABLE = Boolean.TRUE;
        public static final Boolean GOLDILOX_VALUE = Boolean.TRUE;
        public static final Integer PLANET_TYPE = 1;
        public static final Integer PLANET_POPULATION = 25;
        public static final Integer PLANET_POPULATION_LIMIT = 1000000;
        public static final String PLANET_RESOURCE_LIST = "IRON";
        public static final Integer PLANET_PRODUCTION_VALUE = 10;
        public static final Integer PLANET_EXPLORATION_COST = 20;
        public static final Integer PLANET_LOCAL_HOSTILITY = 0;
        public static final Integer PLANET_PLANETARY_HOSTILITY = 10;
        //This is in Sq meters.
        public static final Integer PLANET_SIZE = 500;
        public static final Integer PLANET_HABITAL_ZONES = 100;
        public static final Integer PLANET_FOOD = 1000;
        public static final Integer PLANET_BUILDING_MATERIAL = 100000;
        public static final Integer PLANET_CREDITS = 100000000;
        public static final String PLANET_TABLE_NAME = "planet_info";


    }
}
