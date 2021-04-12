package com.example.topgames;

import java.util.ArrayList;

public class GameData {
    private static final String[] title = new String[]{
            "Portal 2", "The Witcher 3: Wild Hunt",
            "Half-Life: Alyx", "Slay the Spire",
            "Divinity: Original Sin 2", "Grand Theft Auto 5",
            "XCOM 2", "NieR: Automata",
            "Disco Elysium", "Final Fantasy XIV Online"
    };

    private static final int[] thumbnail = new int[]{
            R.drawable.portal211, R.drawable.witcher2,
            R.drawable.halflife31, R.drawable.slayspire41,
            R.drawable.divinity51, R.drawable.gta561,
            R.drawable.xcom27, R.drawable.nier8,
            R.drawable.disco91, R.drawable.ff101
    };

    private static final String[] preview = new String[]{
            "Portal 2 claims the top spot because, in the past decade, nothing else has struck so many chords so perfectly. No game accomplishes so much so well. Its impeccable level design, charming personality, and exceptional and varied puzzle systems make us feel smarter just for getting through it. Plus, its co-op campaign requires a different sort of smarts that remains one of the best multiplayer experiences with pals around.",
            "Deep, lengthy RPGs are a staple of PC gaming, and very few have put a larger chunk of sophisticated content forward than The Witcher 3: Wild Hunt has. Its massive sandbox open-world areas impress, both in terms of scope and density; they’re generously dotted with great monsters to slay, tantalizing mysteries to solve, and personal stories to unfurl.",
            "Valve’s first Half-Life game in 13 years reminded us of the innovation that’s made this series so special and why its return was so anticipated. Just as the first Half-Life proved you could tell a story in a first-person game without taking control of the camera away, and Half-Life 2 pioneered physics-based puzzles and combat, Half-Life: Alyx has set a new standard for polish in virtual reality shooters and is a truly unique experience for VR headset owners.",
            "In a roguelike, variety is king: Slay The Spire's constantly changing decks of ability cards, powerful relics, and the three drastically different playable characters keeps these turn-based battles fresh and engaging for far longer than they have any right to. Watching your character's attacks, defenses, skills, and powers evolve across its three chapters is a journey, and throwing your hand in at the end of a run knowing you may never see its like again can be like saying goodbye to a friend you were only just getting to know.",
            "Divinity: Original Sin 2’s Definitive Edition has cemented it as one of the greatest RPGs of all time. It masterfully mixes pieces of classic cRPGs with more modern mechanics and designs, feeling old and new at the same time. The sequel has improved upon its predecessor's already incredible combat by deepening its systems while simultaneously simplifying and smoothing out its clunkier bits - not to mention it introduced some brutally smart new AI.",
            "Grand Theft Auto V’s sprawling, yet meticulously detailed map is still the high bar to which all other open-world games aspire. Not only is it huge, it’s incredibly dense with excellent content – not just the driving and shooting and three-protagonist story that make up its campaign, and not limited to the numerous side activities, but all the sights, sounds, and bustling activity you'd expect to find in a city teeming with humans, seedy underbelly included.",
            "XCOM 2 builds on the brilliant, high-stakes tactical combat of XCOM: Enemy Unknown, and its War of the Chosen expansion made it even better. It has the same tension of going from a technologically inferior underdog to powerful war machine, with the constant threat of the permanent death of your customized soldiers looming over every decision. However, it turns the formula of defending Earth from alien invaders on its head by boldly recasting XCOM as a guerrilla force attempting to liberate the planet from alien occupation, making the situation feel even more desperate than ever.",
            "Nier: Automata is, by all accounts, a game that shouldn't exist. Director Yoko Taro's original Nier flopped back in 2010, but it nevertheless developed a ravenous fanbase – and for good reason. To put it simply: Nier: Automata does what the original sought to do, learning from its failures and building on its successes to create a blend of hardcore and fluid combat, bullet-hell shoot 'em up segments, and visual novel stylings. It all coalesces into something entirely new.",
            "Disco Elysium took age-old CRPG mechanics and created something entirely modern with them. As well as transplanting the dice-rolls and deep dialogue options from Dungeons and Dragons into a lesser-seen noir-detective setting, it offers entirely original ways to play, such as such as debating against 24 different sections of your own brain, each representative of a different skill or trait.",
            "In short, Final Fantasy XIV is not just the best MMO you can play right now, it’s a fantastic Final Fantasy game in its own right. Through its relaunch and subsequent three expansions FFXIV has slowly morphed from a relatively generic good-versus-evil plot into a sprawling, political, and fantastical thriller. The latest expansion, Shadowbringers, serves both satisfying payoffs to some years-long character arcs, as well as a compelling self-contained story that rivals the Final Fantasy series’ best."
    };

    public static ArrayList<GameModel> getListData(){
        GameModel gameModel;
        ArrayList<GameModel> list = new ArrayList<>();
        for(int i = 0; i < title.length; i++){
            gameModel = new GameModel();
            gameModel.setGambarGame(thumbnail[i]);
            gameModel.setNamaGame(title[i]);
            gameModel.setPreview(preview[i]);
            list.add(gameModel);
        }
        return list;
    }
}
