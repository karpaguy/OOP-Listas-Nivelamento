package br.edu.ifsp.exercicios_aula;
public class sport_team {
    public class Player {
        private String name;
        private int number;
        private String position;
        private boolean isFielded;
        private String team;

        public Player(String name, int number, String position, boolean isFielded) {
            this.name = name;
            this.number = number;
            this.position = position;
            this.isFielded = isFielded;
        }

        public void switchFieldedState() {
            this.isFielded = !this.isFielded;
        }

        public String getStateAsString() {
            return this.isFielded ? "FIELDED" : "NOT-FIELDED";
        }
    }

    public class Team {
        private String name;
        private String baseLocation;
        private String coachName;
        private final Player[] players = new Player[18];
        private int numberOfPlayers;
        private Player captain;

        public Team(String name, String baseLocation, String coachName) {
            this.name = name;
            this.baseLocation = baseLocation;
            this.coachName = coachName;
        }

        private int getPlayerIndexOnTeam(Player player) {
            for (int i = 0; i < numberOfPlayers; i++) {
                if (players[i].equals(player)) return i;
            } return -1;
        }

        public void addPlayer(Player player) {
            players[numberOfPlayers++] = player;
        }
        public void removePlayer(Player player) {
            // Trocando com último elemento, pois a ordem não importa. E decidi testar.
            // O(1)
            int i;
            if ( (i = this.getPlayerIndexOnTeam(player)) == -1 ) {
                System.out.println("PLAYER NOT IN TEAM");
                return;
            }
            this.players[i] = this.players[--numberOfPlayers]; // O próximo index é posicionado ao inserir um player, por isso o decremento antes de remover.

            // # DEBUGGING! REMOVER
            // ##################
            for (int j = 0; j < numberOfPlayers; j++) {
                Player p = players[j];
                System.out.println(
                        j + " | " +
                                p.name + " | #" +
                                p.number + " | " +
                                p.position + " | " +
                                p.getStateAsString()
                );
            }
            // ##################
            // ##################
            // ##################
        }
        public void substitute(Player substitute, Player starter) {
            if (this.getPlayerIndexOnTeam(substitute) == -1) {
                System.out.println("SUBSTITUTE NOT IN TEAM");
                return;
            }
            if (this.getPlayerIndexOnTeam(starter) == -1) {
                System.out.println("STARTER NOT IN TEAM");
                return;
            }
            if (substitute.getStateAsString().equals("FIELDED") || starter.getStateAsString().equals("NOT-FIELDED")) {
                System.out.println("PLAYER POSITION ERROR");
                return;
            }

            substitute.switchFieldedState();
            starter.switchFieldedState();
            System.out.println("WORKED");
        }
        public void setCaptain(Player captain) {
            this.captain = captain;
        }
        // public Player[] getFieldedPlayers() {}
        // public Player[] getOutfieldedPlayers() {}
    }

    public void main(String[] args) {
        Player novoRomario = new Player("Romario", 10, "Defender", true);
        Player novoJose = new Player("Jose", 11, "Defender", false);
        Player novoUsuario = new Player("Usuario", 12, "Defender", true);
        Player novoBoleiro = new Player("Boleiro", 13, "Defender", false);
        Player novoAlencar = new Player("Alencar", 14, "Defender", false);
        System.out.println(novoRomario.getStateAsString());

        Team brasilFoot = new Team("Brasil Foot", "Brasil", "Felipe Bisneto");
        brasilFoot.addPlayer(novoRomario);
        brasilFoot.addPlayer(novoJose);
        brasilFoot.addPlayer(novoUsuario);
        brasilFoot.addPlayer(novoBoleiro);
        brasilFoot.addPlayer(novoAlencar);

        brasilFoot.substitute(novoJose, novoRomario);
        brasilFoot.substitute(novoJose, novoRomario);

        brasilFoot.removePlayer(novoUsuario);

        brasilFoot.substitute(novoUsuario, novoBoleiro);
    }
}

