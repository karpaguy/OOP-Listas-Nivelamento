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
        private String captain;

        public Team(String name, String baseLocation, String coachName) {
            this.name = name;
            this.baseLocation = baseLocation;
            this.coachName = coachName;
        }

        private boolean getPlayerOnTeam(Player player) {
            for (int i = 0; i < numberOfPlayers; i++) {
                if (players[i].equals(player)) return true;
            } return false;
        }

        public void addPlayer(Player player) {
            players[numberOfPlayers++] = player;
        }
        public void removePlayer(Player player) {

        }
        public void substitute(Player substitute, Player starter) {
            if (!this.getPlayerOnTeam(substitute)) {
                System.out.println("SUBSTITUTE NOT IN TEAM");
                return;
            }
            if (!this.getPlayerOnTeam(starter)) {
                System.out.println("STARTER NOT IN TEAM");
                return;
            }
            if (substitute.getStateAsString().equals("FIELDED") || starter.getStateAsString().equals("NOT-FIELDED")) {
                System.out.println("PLAYER POSITION ERROR");
            }

            // Nao se pode acessar o isFielded diretamente do jogador. Vamos precisar criar uma ligação.
            System.out.println("WORKED");
        }
        public void setCaptain(Player captain) {}
        // public Player[] getFieldedPlayers() {}
        // public Player[] getOutfieldedPlayers() {}
    }

    void main() {
        Player novoRomario = new Player("Romario", 10, "Defender", true);
        Player novoJose = new Player("Jose", 11, "Defender", false);
        System.out.println(novoRomario.getStateAsString());

        Team brasilFoot = new Team("Brasil Foot", "Brasil", "Felipe Bisneto");
        brasilFoot.addPlayer(novoRomario);
        brasilFoot.addPlayer(novoJose);

        brasilFoot.substitute(novoRomario, novoJose);
    }
}

