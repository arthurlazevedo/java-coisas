package Alura.CursoDois;

public class Movie {
    String name;
    private Double totalRatings;
    private Double sumRatings;
    Integer duration;
    TipoPlanoEnum disponibility;

    @Deprecated
    Movie() {
        this(null, null, null);
    }

    Movie(String name, Integer duration) {
        this(name, duration, TipoPlanoEnum.POBRES);
    }

    Movie(String name, Integer duration, TipoPlanoEnum disponibility) {
        this.name = name;
        this.duration = duration;
        this.disponibility = disponibility;
    }

    void rate(Double rating) {
        this.sumRatings += rating;
        this.totalRatings++;
    }

    Double getAverageRating() {
        return totalRatings == 0 ? Double.NaN : sumRatings / totalRatings;
    }

}
