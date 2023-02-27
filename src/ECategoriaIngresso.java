public enum ECategoriaIngresso implements ICategoriaIngresso {
    PISTA {

        @Override
        public double calculaValorDoIngresso(Evento evento) {
            return evento.getValorUnico();
        }

        @Override
        public void imprimeValorDoIngresso(Evento evento) {
            System.out.println("Categoria: Ingresso Pista");
            System.out.println("Valor do ingresso: " + calculaValorDoIngresso(evento));
        }

    },

    VIP {

        @Override
        public double calculaValorDoIngresso(Evento evento) {
            return evento.getValorUnico() + (evento.getValorUnico() * 0.30);
        }

        @Override
        public void imprimeValorDoIngresso(Evento evento) {
            System.out.println("Categoria: Ingresso Vip");
            System.out.println("Valor do ingresso: " + calculaValorDoIngresso(evento));
        }

    },

    CAMAROTE {

        @Override
        public double calculaValorDoIngresso(Evento evento) {
            return evento.getValorUnico() + (evento.getValorUnico() * 0.60);
        }

        @Override
        public void imprimeValorDoIngresso(Evento evento) {
            System.out.println("Categoria: Ingresso Camarote");
            System.out.println("Valor do ingresso: " + calculaValorDoIngresso(evento));
        }

    },
}
