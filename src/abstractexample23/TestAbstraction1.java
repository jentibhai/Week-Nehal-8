package abstractexample23;

class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s=new Shape() {
            @Override
            public void draw() {

            }
        } ;
        s.draw();

    }

    }


