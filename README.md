# TimeFighter

This application is a submission for working on the "Your First Kotlin Android App" challenge from [Raywenderlich](https://www.raywenderlich.com/4936497-your-first-kotlin-android-app).
And as one of the requirements to take part in MamiCamp 2020 organized by [Mamikos](https://mamikos.com/).

### Publish On Playtore

<a href='https://play.google.com/store/apps/details?id=com.proyek.akhir.timefighter&pcampaignid=pcampaignidMKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1'><img alt='Get it on Google Play' src='https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png'/></a>

## Challenge 1 : Produce a todo list
On this challenge we must analyze what the app must we build when looking image of design.
<table>
  <tr>
    <td>Design</td>
     <td>Todo List</td>
  </tr>
  <tr>
    <td><img src="https://github.com/nick2905/TimeFighter/blob/master/screenshot/challenge_basic_todo_list.png" width=270 height=480></td>
    <td>
      <h4>* 1 Activity</h4>
      <h4>* 1 Textview for Score on top left side</h4>
      <h4>* 1 Textview for Time Left on top right side</h4>
      <h4>* 1 Button + Text On Button on center of activity</h4>
      <h4>* Appbar Textcolor #FFFFFF</h4>
      <h4>* Adding Menu on Appbar</h4>
    </td>
  </tr>
 </table>

## Challenge 2 : Adding Textview
On this challenge we must implement textview on app.
<table>
  <tr>
    <td>Design</td>
     <td>Adding Textview</td>
  </tr>
  <tr>
    <td><img src="https://github.com/nick2905/TimeFighter/blob/master/screenshot/challenge_basic_add_textview.png" height=180></td>
    <td>
      <img src="https://github.com/nick2905/TimeFighter/blob/master/screenshot/challenge_add_text_view_implement.png" height=180>
    </td>
  </tr>
 </table>

## Challenge 3 : Adding a Constraint
On this challenge we must implement a button with constraint layout.
<table>
  <tr>
    <td>Design</td>
    <td>Implement Adding constraint</td>
  </tr>
  <tr>
    <td><img src="https://github.com/nick2905/TimeFighter/blob/master/screenshot/challenge_basic_adding_constraint.png" height=180></td>
    <td><img src="https://github.com/nick2905/TimeFighter/blob/master/screenshot/challenge_implement_adding_constraint.png" height=180></td>
  </tr>
</table>

## Challenge 4 : Adding Id
On this challenge we must make id for the textview.
<br>
<img src="https://github.com/nick2905/TimeFighter/blob/master/screenshot/challenge_adding_id.png" height=180/>

## Challenge 5 : Adding a New String Resource
On this challenge we must add string on text into id on the resource, res/values/string.xml.
<br>
<img src="https://github.com/nick2905/TimeFighter/blob/master/screenshot/challenge_adding_string.png" height=180/>

## Challenge 6 : Add a property
On this challenge we must add property to textview and the button. But i have been using viewbinding, so we can use the layout without initialize again.
```
viewBinding {
        enabled = true
    }
```
## Challenge 7 : Adding Started Score
On this challenge we must set value of score is 0. So i make it using data binding with viewmodel and livedata. So when the button is clicked the score can be update from livedata and when i do configuration change that still there.
<br>
<img src="https://github.com/nick2905/TimeFighter/blob/master/screenshot/challenge_display_starting_score.png" height=180/>

## Challenge 8 : Trigger Log Statement
On this challange we must showing an information from logcat that our data has change because configuration navigation. But im using data binding for showing score and time left. So the logcat didn't show anything and the app is normal when changed rotation.
<br>
<img src="https://github.com/nick2905/TimeFighter/blob/master/screenshot/challenge_trigger_log_statement.png" height=210/>

## Challenge 9 : Changing Colors
On this challenge we must change textview color into black and background color into some color.
<br>
<img src="https://github.com/nick2905/TimeFighter/blob/master/screenshot/challenge_changing_colors.png" height=210/>

## Challenge 10 : Adding an animation
On this challenge we must create an animation blink animation for score and bouncing animation on button "Tap Me Here!"
<br>
<img src="https://github.com/nick2905/TimeFighter/blob/master/screenshot/challenge_add_an_animation.png" height=210/>

### Authors

* **Nicolas Manurung** - *Institut Teknologi Del Student* 
* [LinkedIn](https://www.linkedin.com/in/nicolas-manurung-263204190/)
* [Instagram](https://www.instagram.com/nicolasmanurung/)
