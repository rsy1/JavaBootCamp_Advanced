package bk4_06BulkDataOperationsWithCollections;

import java.util.ArrayList;

public class SpellsTest {

	public static void main(String[] args) {
		ArrayList<Spell> spells = new ArrayList<>();
		spells.add(new Spell("Aparecium", Spell.SpellType.SPELL, "Makes invisible ink appear."));
		spells.add(new Spell("Avis", Spell.SpellType.SPELL, "Launches birds from your wand."));
		spells.add(new Spell("Engorgio", Spell.SpellType.CHARM, "Enlarges something."));
		spells.add(new Spell("Fidelius", Spell.SpellType.CHARM, "Hides a secret within someone."));
		spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL, "Stops all current spells."));
		spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE, "Locks an opponent's legs."));

		// Usual for each loop statement
		for (Spell spell : spells)
			System.out.println(spell.name);

		System.out.println();

		// foreach statement using the stream() method
		spells.stream().forEach(s -> System.out.println(s));

		System.out.println();

		// listing just the spells, not the charms or curses. Using a traditional
		// foreach loop
		for (Spell spell : spells) {
			if (spell.type == Spell.SpellType.SPELL)
				System.out.println(spell.name);
		}
		System.out.println();

		// listing just the spells, not the charms or curses. Using the stream() method
		// ------------------------------------------------------------------------------
		// The stream method converts the ArrayList to a stream. Then the stream’s
		// filter method is used to select just the SPELL items. Finally, the
		// forEach method sends the selected items to the console. lambda expressions
		// are used in both the forEach method and the filter method.
		spells.stream().filter(s -> s.type == Spell.SpellType.SPELL).forEach(s -> System.out.println(s));

		System.out.println();

		// just the spells that start with the letter A are listed using
		// parallelStream() method of the Collection interface
		spells.parallelStream().filter(s -> s.type == Spell.SpellType.SPELL)
				.filter(s -> s.name.toLowerCase().startsWith("a")).forEach(s -> System.out.println(s));

		System.out.println();

		// Printing all of HP’s spells using a parallelStream() method.
		spells.parallelStream().forEach(s -> System.out.println(s));

		System.out.println();
		
		//using a parallel stream, stream is split and run on two or more threads,order of processing unpredictable
		System.out.println("First Parallel stream: ");
		spells.parallelStream().forEach(s -> System.out.println(s));
		System.out.println("\nSecond Parallel stream: ");
		spells.parallelStream().forEach(s -> System.out.println(s));
	}
}
