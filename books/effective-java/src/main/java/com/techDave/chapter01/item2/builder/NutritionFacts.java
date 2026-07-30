package com.techDave.chapter01.item2.builder;

public class NutritionFacts {
    private final Integer servingSize;
    private final Integer servings;
    private final Integer calories;
    private final Integer fat;
    private final Integer sodium;
    private final Integer carbohydrate;

    public static class Builder {
        // Required parameters
        private final Integer servingSize;
        private final Integer servings;
        
        // Optional parameters - initialized to default values
        private Integer calories = 0;
        private Integer fat = 0;
        private Integer sodium = 0;
        private Integer carbohydrate = 0;

        public Builder(Integer servingSize, Integer servings) {
            this.servingSize = servingSize;
            this.servings    = servings;
        }

        public Builder calories(int val) { 
            calories = val; return this; 
        }
        public Builder fat(int val) { 
            fat = val; return this; 
        }
        public Builder sodium(int val) { 
            sodium = val; return this; 
        }
        public Builder carbohydrate(int val) { 
            carbohydrate = val; return this; 
        }
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
}

