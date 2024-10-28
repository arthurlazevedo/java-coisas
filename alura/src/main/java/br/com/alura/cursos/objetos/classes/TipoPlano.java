package alura.src.main.java.br.com.alura.cursos.objetos.classes;

public enum TipoPlano {
    POBRES("Plano Básico", "plano pros pobre fudido"),
    SE_ACHAM_RICO("Plano intermediário", "plano pros que se acha rico"),
    ULTRA_SUPER_PREMIUM("Plano Premium", "plano pros podre de rico");

    TipoPlano(final String falseName, final String trueName) {
        this.falseName = falseName;
        this.trueName = trueName;
    }

    final String falseName;
    final String trueName;
}
