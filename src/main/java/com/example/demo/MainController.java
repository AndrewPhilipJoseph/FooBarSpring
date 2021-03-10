package com.example.demo;

import com.example.demo.algos.CoinGameFRQ3;
import com.example.demo.algos.Streak;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/AndrewLabs/AndrewMain")
    public String AndrewPage() {
        return "AndrewLabs/AndrewMain.html";
    }

  

    @GetMapping("/CoinGame")
    public String CG(@RequestParam(name = "startingAmount", required = false, defaultValue = "15") String startAmount, @RequestParam(name = "rounds", required = false, defaultValue = "5") String round, Model model) {
        CoinGameFRQ3 CoinGame = new CoinGameFRQ3((Integer.valueOf(startAmount)), Integer.valueOf(round));
        CoinGame.playGame();

        model.addAttribute("winner", CoinGame.getwinner());

        return "AndrewLabs/CoinGame";
    }

    @GetMapping("/LongStreak")
    public String LS(@RequestParam(name = "inputString", required = false, defaultValue = "CCAAAAATTT!") String inputingString, Model model) {
        Streak streak = new Streak(inputingString);
        //model.addAttribute("")
        return "AndrewLabs/LongStreak";
    }



    @GetMapping("/Games/GamesMain")
    public String Games() {
        return "Games/GamesMain.html";
    }

    @GetMapping("/Games/TicTacToe/tic")
    public String TTT() {
        return "Games/TicTacToe/tic.html";


    }
/*
    @GetMapping("/Restauraunt")
    public String restauraunt(@RequestParam(name = "rsvp", required = false, defaultValue = "15") String rsvp, @RequestParam(name = "rounds", required = false, defaultValue = "5") String round, Model model) {
        CoinGameFRQ3 CoinGame = new CoinGameFRQ3((Integer.valueOf(startAmount)), Integer.valueOf(round));
        CoinGame.playGame();

        model.addAttribute("winner", CoinGame.getwinner());

        return "AndrewLabs/CoinGame";
    }
*/




}
