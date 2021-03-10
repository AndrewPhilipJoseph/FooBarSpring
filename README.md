# FooBarSpring
Welcome to our Trimester 2 Java Spring Project!

| FooBar Team |
|----|
| [David Ramsayer](https://github.com/davidramsayer) |
| [Andrew Joseph](https://github.com/AndrewPhilupJoseph) |
| [Brendan Trinh](https://github.com/brendan8503) |

We have created a live website showing off many different applications of html, css, java, and javascript code! <br> 
[Check it out here!](http://54.193.51.220) <br>
Below is a guided outline to our project, as well as a brief log of some work assignments. To see everything follow the link to the Project Board below. <br>
We hope you like our work! 

#### [Project Board - Tickets](https://github.com/AndrewPhilipJoseph/FooBarSpring/projects/1)
#### [Project Plan](https://docs.google.com/document/d/1BfC11oQnmn8DtsHVdqGQ3fDUcyWNKPyixhZ0jkPgNaM)

------------------------------------------------

# **Guided Overview**
   ### > Website Deployment
   - Andrew <br> <br>
<img src="https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/static/Screenshot (131).png" height="auto" width="30%"> <br>
     - Link to [code]()-
     - Link to [website](http://54.193.51.220)
     - Link to [ticket](https://github.com/AndrewPhilipJoseph/FooBarSpring/projects/1#card-56555908)
   ### > Login & Navigation
   - Andrew <br> <br>
<img src="https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/static/Screenshot (131).png" height="auto" width="30%"> <br>
     - Link to [code](https://github.com/AndrewPhilipJoseph/FooBarSpring/tree/Other/src/main/resources/templates/Login)
     - Link to [runtime]()-
     - Link to [ticket](https://github.com/AndrewPhilipJoseph/FooBarSpring/projects/1#card-56568947)
   ### > Color Guessing Game
   - This game depicts a varying number of squares (based on the selected difficulty), each a different color. There is an RBG sequence at the top, and the user needs to imagine what color would be created by the sequence. They then click the color square that they believe corresponds. They can continue to guess if they get it wrong. There is a reset button along the top left of the bar.
   - This uses functions like generateRandomColors with var for red (r), green (g), and blue (b) to randomize the sequence and subsequent color. There is a reset function under "new rgb code" which generates new random colors. <br> <br>
<img src="https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/static/Screenshot (130).png" height="auto" width="40%"> <br>
     - Link to [code](https://github.com/AndrewPhilipJoseph/FooBarSpring/tree/Other/src/main/resources/templates/Games/GuesstheColor)
     - Link to [runtime]()-
     - Link to [ticket](https://github.com/AndrewPhilipJoseph/FooBarSpring/projects/1#card-56551048)
   ### > Memory Matching Game
   - This matching card game works by randomly assigning letter cards to spots in the grid. The user is only allowed to flip two at a time before they are recovered. If you uncover matching cards with the same turn, they stay uncovered. The goal is to uncover the entire grid.
   - This uses if/else while checking for matching tiles in order to either keep them uncovered or recover them. There are seperate var a tile's ID and the value it contains. This allows for the comparisons to be done. <br> <br>
<img src="https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/static/Screenshot (126).png" height="auto" width="40%"> <br>
     - Link to [code](https://github.com/AndrewPhilipJoseph/FooBarSpring/tree/Other/src/main/resources/templates/Games/MemoryGame)
     - Link to [runtime]()-
     - Link to [ticket](https://github.com/AndrewPhilipJoseph/FooBarSpring/projects/1#card-56551070)
   ### > Snake Game
   - Brendan <br> <br>
<img src="https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/static/Screenshot (127).png" height="auto" width="30%"> <br>
     - Link to [code](https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/templates/Games/snake.html)
     - Link to [runtime]()-
     - Link to [ticket](https://github.com/AndrewPhilipJoseph/FooBarSpring/projects/1#card-54340604)
   ### > Tic-Tac-Toe Game
   - cool <br> <br>
<img src="https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/static/Screenshot (129).png" height="auto" width="30%"> <br>
     - Link to [code](https://github.com/AndrewPhilipJoseph/FooBarSpring/tree/Other/src/main/resources/templates/Games/TicTacToe)
     - Link to [runtime]()-
     - Link to [ticket](https://github.com/AndrewPhilipJoseph/FooBarSpring/projects/1#card-55945819)
   ### > AP FRQ's
   - Andrew <br> <br>
<img src="https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/static/Screenshot (132).png" height="auto" width="50%"> <br>
     - Link to [code](https://github.com/AndrewPhilipJoseph/FooBarSpring/tree/Other/src/main/resources/templates/AndrewLabs)
     - Link to [runtime]()-
     - Link to [ticket](https://github.com/AndrewPhilipJoseph/FooBarSpring/projects/1#card-54732413)

## **Implementation work**
| Scrum Member | Description |
|--------|-------|
| David Ramsayer | Redid [game](https://github.com/AndrewPhilipJoseph/FooBarSpring/tree/Other/src/main/resources/static/TicTacToe) using javascript (typescript), css, and html code for practice with the three forms. |
| Andrew Joseph  |Created basic page layout, currently working on implementation. Got first lab mostly done, but confused about output, everything else seems to be connected and work correctly [first lab integration into HTML.](https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/templates/AndrewLabs/CoinGame.html) Completed ticket of integrating labs into HTML (more will be added in the future, the one completed here took longer than future ones because it was the first one that I have connected. [Ticket/issue.](https://github.com/AndrewPhilipJoseph/FooBarSpring/issues/1) Concept of multiple pages [was made.](https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/templates/AndrewLabs/AndrewMain.html)|
| Brendan Trinh  |Redid and added snakegame into the list of other games for extra practice on html code|



## **Initial Presentation**

| Scrum Member | Description |
|--------|-------|
| David Ramsayer | Added old [TicTacToe](https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/main/src/src/Imports/TicTacToeUI.java) game to work with while learning Spring. |
| Andrew Joseph  |Created startup files (everything in the default master branch) through the use of the spring online tutorial. I also worked on setting up the online server, which is nearly done (the only remaining parts are the service files)|
| Brendan Trinh  |Trying to add code from the old FRQS and convert it into the the Spring Format and creating method of accessing easter egg and for future minilabs

