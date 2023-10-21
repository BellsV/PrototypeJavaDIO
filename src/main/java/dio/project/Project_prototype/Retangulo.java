package dio.project.Project_prototype;

public class Retangulo extends Formas{
    public int largura;
    public int altura;

    public Retangulo(){}

    public Retangulo(Retangulo target){
        super(target);
        if (target !=null){
            this.largura = target.largura;
            this.altura = target.altura;
        }
    }
    @Override
    public Formas clone() {
        return new Retangulo(this);
    }
    @Override
    public boolean equals(Object object2){
        if (!(object2 instanceof Retangulo) || !super.equals(object2)) return false;
        Retangulo forma2 = (Retangulo) object2;
        return forma2.largura == largura && forma2.altura == altura;
    }
}
