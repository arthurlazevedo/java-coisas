package alura.src.main.java.br.com.alura.cursos.objetos.classes;

public class Movie {
    String name;
    private Double totalRatings;
    private Double sumRatings;
    Integer duration;
    TipoPlano disponibility;

    public static Movie[] catalog = {
            new Movie("Inception", 148, TipoPlano.ULTRA_SUPER_PREMIUM),
            new Movie("The Godfather", 175),
            new Movie("The Dark Knight", 152, TipoPlano.SE_ACHAM_RICO),
            new Movie("Pulp Fiction", 154, TipoPlano.ULTRA_SUPER_PREMIUM),
            new Movie("Forrest Gump", 142, TipoPlano.SE_ACHAM_RICO),
            new Movie("The Matrix", 136),
            new Movie("Fight Club", 139, TipoPlano.ULTRA_SUPER_PREMIUM),
            new Movie("Interstellar", 169),
            new Movie("Gladiator", 155, TipoPlano.SE_ACHAM_RICO),
            new Movie("Indiana Jones", 142, TipoPlano.ULTRA_SUPER_PREMIUM),
            new Movie("Lord of the Rings", 178, TipoPlano.SE_ACHAM_RICO),
            new Movie("The Avengers", 143),
            new Movie("Titanic", 195, TipoPlano.ULTRA_SUPER_PREMIUM),
            new Movie("Jurassic Park", 127),
            new Movie("Star Wars", 121, TipoPlano.SE_ACHAM_RICO),
            new Movie("The Lion King", 88, TipoPlano.ULTRA_SUPER_PREMIUM),
            new Movie("Back to the Future", 116),
            new Movie("The Silence of the Lambs", 118, TipoPlano.ULTRA_SUPER_PREMIUM),
            new Movie("Avatar", 162)
    };

    @Deprecated
    Movie() {
        this(null, null, null);
    }

    Movie(String name, Integer duration) {
        this(name, duration, TipoPlano.POBRES);
    }

    Movie(String name, Integer duration, TipoPlano disponibility) {
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
