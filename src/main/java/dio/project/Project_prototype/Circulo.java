package dio.project.Project_prototype;

public class Circulo extends Formas{
    public int radio;
    public Circulo(){}
    public Circulo (Circulo target){
        super(target);
        if (target !=null){
            this.radio = target.radio;
        }
    }
    @Override
    public Formas clone() {
        return new Circulo(this);
    }

    @Override
    public boolean equals(Object object2){
        if (!(object2 instanceof Circulo) || !super.equals(object2)) return false;
        Circulo forma2 = (Circulo) object2;
        return forma2.radio ==radio;
    }
}
