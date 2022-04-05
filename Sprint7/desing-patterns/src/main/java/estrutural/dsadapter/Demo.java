package estrutural.dsadapter;

import estrutural.dsadapter.adapter.SquarePegAdapter;
import estrutural.dsadapter.round.RoundHole;
import estrutural.dsadapter.round.RoundPeg;
import estrutural.dsadapter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if (hole.fits(rpeg)) {
            System.out.println("O pino redondo r5 se encaixa no furo redondo r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("O pino quadrado w2 se encaixa no furo redondo r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("O pino quadrado w20 não se encaixa no orifício redondo r5.");
        }
    }
}