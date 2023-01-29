package dio;
/*
    @author  Rosangela Oliveira
    Criando esse padrão a partir do apresentado na aula - DESAFIO PADRÕES.
    estou criando utilizando a IDE IntelliJ.
 */
public class SingletonDesafio {

        private static SingletonDesafio novainstancia {
            private SingletonDesafio {
                super();
        }
        public static SingletonDesafio GetNovainstancia() {
                if (novainstancia == null) {
                    novainstancia = new SingletonDesafio();
                }
                return novainstancia;        }
    }
}
