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
## **Runtime Guidance**
* The deployment update failed, currently trying to resolve
  * Clone the project in InteliJ.
  * Run DemoApplication.
  * Open Localhost:8080 in your browser.
### > Login 
   - Basic implementation of a login system
   - Can input username and password
   - login only goes back to the home page
   - Basic css animations for when either field is selected <br> <br>
<img src="https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/static/Screenshot (131).png" height="auto" width="30%"> <br>
     - Link to [code](https://github.com/AndrewPhilipJoseph/FooBarSpring/tree/Other/src/main/resources/templates/Login)

   ### > Color Guessing Game
   - This game depicts a varying number of squares (based on the selected difficulty), each a different color. There is an RBG sequence at the top, and the user needs to imagine what color would be created by the sequence. They then click the color square that they believe corresponds. They can continue to guess if they get it wrong. There is a reset button along the top left of the bar.
   - This uses functions like generateRandomColors with var for red (r), green (g), and blue (b) to randomize the sequence and subsequent color. There is a reset function under "new rgb code" which generates new random colors. <br> <br>
<img src="https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/static/Screenshot (130).png" height="auto" width="40%"> <br>
     - Link to [code](https://github.com/AndrewPhilipJoseph/FooBarSpring/tree/Other/src/main/resources/templates/Games/GuesstheColor)
     - Link to [runtime]() xx
     - Link to [ticket](https://github.com/AndrewPhilipJoseph/FooBarSpring/projects/1#card-56551048)
   ### > Memory Matching Game
   - This matching card game works by randomly assigning letter cards to spots in the grid. The user is only allowed to flip two at a time before they are recovered. If you uncover matching cards with the same turn, they stay uncovered. The goal is to uncover the entire grid.
   - This uses if/else while checking for matching tiles in order to either keep them uncovered or recover them. There are seperate var for each tile's ID and the value it contains. This allows for the comparisons to be done. <br> <br>
<img src="https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/static/Screenshot (126).png" height="auto" width="40%"> <br>
     - Link to [code](https://github.com/AndrewPhilipJoseph/FooBarSpring/tree/Other/src/main/resources/templates/Games/MemoryGame)
     - Link to [runtime]() xx
     - Link to [ticket](https://github.com/AndrewPhilipJoseph/FooBarSpring/projects/1#card-56551070)
   ### > Snake Game
   - This snake game is played with the arrow keys on the keyboard. It was done entirely in html, so it is simple stylistically.
   - Uses a variable x to set the draw per second. There is a math.random to place the apple at a random location, which is called whenever the snake and apple meet in location. This event also adds length to the var tailSize. <br> <br>
<img src="https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/static/Screenshot (127).png" height="auto" width="30%"> <br>
     - Link to [code](https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/templates/Games/snake.html)
     - Link to [runtime]() xx
     - Link to [ticket](https://github.com/AndrewPhilipJoseph/FooBarSpring/projects/1#card-54340604)
   ### > Tic-Tac-Toe Game
   - Tic-Tac-Toe is a pretty self explanatory game. The user will play against themselves in this implementation. <br>
   - This is the first old project brought back for practice with html, css, javascript, and spring deployment. It was a good way to familiarize myself with these concepts. There are event handlers for cell interaction and player switching, and var used for winning conditions. Using font families allowed for an easy unique factor. <br>
<img src="https://github.com/AndrewPhilipJoseph/FooBarSpring/blob/Other/src/main/resources/static/Screenshot (129).png" height="auto" width="30%"> <br>
     - Link to [code](https://github.com/AndrewPhilipJoseph/FooBarSpring/tree/Other/src/main/resources/templates/Games/TicTacToe)
     - Link to [runtime]() xx
     - Link to [ticket](https://github.com/AndrewPhilipJoseph/FooBarSpring/projects/1#card-55945819)
  






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

