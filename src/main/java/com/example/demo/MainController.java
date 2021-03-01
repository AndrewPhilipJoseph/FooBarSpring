package com.example.demo;

import com.example.demo.algos.CoinGameFRQ3;
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




}
