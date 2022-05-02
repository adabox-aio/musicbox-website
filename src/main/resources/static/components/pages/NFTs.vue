<template>
  <div>
    <div class="social-icons">
      <v-btn large href="https://twitter.com/MusicBoxCNFTs" target="_blank" icon>
        <v-icon large style="text-shadow: 1px 1px 3px rgba(0, 0, 0, 1);">mdi-twitter</v-icon>
      </v-btn>
      <v-btn large href="https://discord.gg/y9WQPWPSfF" target="_blank" icon>
        <v-icon large style="text-shadow: 1px 1px 3px rgba(0, 0, 0, 1);">mdi-discord</v-icon>
      </v-btn>
      <v-btn large href="https://www.instagram.com/musicboxcnft/" target="_blank" icon>
        <v-icon large style="text-shadow: 1px 1px 3px rgba(0, 0, 0, 1);">mdi-instagram</v-icon>
      </v-btn>
      <v-btn large href="https://www.youtube.com/channel/UCHJYf0DlshYXnk-BxYwvhWg" target="_blank" icon>
        <v-icon large style="text-shadow: 1px 1px 3px rgba(0, 0, 0, 1);">mdi-youtube</v-icon>
      </v-btn>
    </div>
    <header class="header">
      <nav>
        <div>
          <ul></ul>
        </div>
        <div class="menu-item logo">
          <a href="/">MusicBox</a>
        </div>
        <div>
          <ul></ul>
        </div>
      </nav>
    </header>
    <main>
      <div class="hero-section">
        <div class="bg-image"></div>
        <div class="hero-titles-container">
          <div class="hero-title">
            <p>Music touches us emotionally,</p>
            <p>where images and words alone can't.</p>
          </div>
          <div class="hero-description">
            A music centric NFT<br>Powered by Cardano
          </div>
        </div>
      </div>
      <v-card class="transparent about" v-intersect="{
            handler: onAboutIntersect,
            options: {
              threshold: [0.25]
            }
          }">
        <div :class="isAboutIntersecting ? 'text-container animate' : 'text-container animate slide'">
          <div class="about-title">
            About
          </div>
          <div class="about-text">
            Our project explores the combination of sound &amp; technology. While the music was created by us, it is assembled by our boxes.<br><br>
            We love music, sound &amp; boxes. The three combined should remind us who we are and where we are going in this ocean of chaos.
          </div>
        </div>
        <img src="../../img/crystals.png" alt="" :class="isAboutIntersecting ? 'transparent animate' : 'transparent animate scale'">
      </v-card>
      <div class="collection">
        <v-card flat :class="isIntersecting ? 'transparent animate' : 'transparent animate hide'" v-intersect="{
            handler: onIntersect,
            options: {
              threshold: [0.25]
            }
          }" >
          <div class="collection-title">
            The Collection
          </div>
          <div class="text">
            The boxes have visited many exotic locations, from urban streets, through the deserts and all the way to frozen lakes of the north and will play music that fit said locations. They come in a variety of materials shapes and colors, hand picked and designed by us. The boxes are not randomized and have been hand crafted by us.
          </div>
        </v-card>
        <v-card class="transparent boxes-container" v-intersect="{
            handler: onBoxesIntersect,
            options: {
              threshold: [0.25]
            }
          }">
          <div class="collection-box" style="background-image: url(./img/collection/iceworld-mobile.png);">
            <picture>
              <source media="(max-width: 600px)" srcset="./img/collection/icebox 1-mobile.png">
              <img src="./img/collection/icebox 1.png" :class="isBoxesIntersecting ? 'delay-1' : 'animate delay-1 slideY'">
            </picture>
          </div>
          <div class="collection-box" style="background-image: url(./img/collection/desert-mobile.png);">
            <picture>
              <source media="(max-width: 600px)" srcset="./img/collection/desert box-mobile.png">
              <img src="./img/collection/desert box.png" :class="isBoxesIntersecting ? 'delay-2' : 'animate delay-2 slideY'">
            </picture>
          </div>
          <div class="collection-box" style="background-image: url(../img/collection/Cyberpunk-street-mobile.png);">
            <picture>
              <source media="(max-width: 600px)" srcset="./img/collection/cyberbox-mobile.png">
              <img src="./img/collection/cyberbox.png" :class="isBoxesIntersecting ? 'delay-3' : 'animate delay-3 slideY'">
            </picture>
          </div>
        </v-card>
      </div>
      <v-card class="transparent team" v-intersect="{
            handler: onTeamIntersect,
            options: {
              threshold: [0.25]
            }
          }">
        <div :class="isTeamIntersecting ? 'team-title ma-0 animate-slow' : 'team-title ma-0 animate fade'">
          The Team
        </div>
        <div class="team-members">
          <div class="team-member-container">
            <div :class="isTeamIntersecting ? 'member-img animate' : 'member-img animate slideX'">
              <img src="./img/team/miller.png">
            </div>
            <div :class="isTeamIntersecting ? 'member-name animate' : 'member-name animate fade'">ThirdEye</div>
            <div>
              <div :class="isTeamIntersecting ? 'member-job-single delay-1' : 'member-job-single delay-1 fade'">Sound Director</div>
              <div :class="isTeamIntersecting ? 'member-job-single delay-2' : 'member-job-single delay-2 fade'">Musician</div>
              <div :class="isTeamIntersecting ? 'member-job-single delay-3' : 'member-job-single delay-3 fade'">Producer &amp; Mastering</div>
            </div>
          </div>
          <div class="team-member-container">
            <div :class="isTeamIntersecting ? 'member-img animate' : 'member-img animate slideY'">
              <img src="./img/team/hild.png">
            </div>
            <div :class="isTeamIntersecting ? 'member-name animate' : 'member-name animate fade'">hild</div>
            <div>
              <div :class="isTeamIntersecting ? 'member-job-single delay-1' : 'member-job-single delay-1 fade'">Art Director</div>
              <div :class="isTeamIntersecting ? 'member-job-single delay-2' : 'member-job-single delay-2 fade'">Musician</div>
              <div :class="isTeamIntersecting ? 'member-job-single delay-3' : 'member-job-single delay-3 fade'">Marketing</div>
            </div>
          </div>
          <div class="team-member-container">
            <div :class="isTeamIntersecting ? 'member-img animate' : 'member-img animate slideXreverse'">
              <img src="./img/team/dudi.png">
            </div>
            <div :class="isTeamIntersecting ? 'member-name animate' : 'member-name animate fade'">Dudi</div>
            <div>
              <div :class="isTeamIntersecting ? 'member-job-single delay-1' : 'member-job-single delay-1 fade'">R&D Director</div>
              <div :class="isTeamIntersecting ? 'member-job-single delay-2' : 'member-job-single delay-2 fade'">Software Engineer</div>
              <div :class="isTeamIntersecting ? 'member-job-single delay-3' : 'member-job-single delay-3 fade'">Project Architect</div>
            </div>
          </div>
        </div>
      </v-card>
      <v-card class="transparent instruments-container" v-intersect="onInstrumentsIntersect">
        <div :class="isInstrumentsIntersecting ? 'instruments-title animate-slow' : 'instruments-title animate fade'">Instruments</div>
        <div :class="isInstrumentsIntersecting ? 'introductory text pa-0 animate' : 'introductory text pa-0 animate slide'">As technologists, music &amp; sound enthusiasts, we collaborated with musicians to record a collection of sounds and beats from the best instruments known to humanity. From Korg Polysix, to the rare Linn Drum, all sounds were recorded using the industry's best-in-class signal chains.</div>
        <div class="instruments-grid">
          <div class="instrument" v-for="instrument in instruments">
            <v-hover v-slot:default="{ hover }">
              <v-card flat class="ma-2 pa-0 transparent" width="230" style="z-index: 1">
                <v-img :src="instrument.img" v-on:error="instrument.img=instrument.fallback" height="200" :aspect-ratio="1.15" contain class="hoverLight" :class="isInstrumentsIntersecting ? 'animate-slow' : 'animate fade'" :alt="instrument.vendor+' '+instrument.model">
                  <transition name="slide-fade">
                    <div v-if="hover" class="d-flex transition-fast-in-fast-out v-card--reveal" style="height: 100%; align-items: center; justify-content: center;">
                      <v-tooltip top open-delay="2000" content-class="tooltip">
                        <template v-slot:activator="{ on, attrs }">
                          <v-btn fab icon v-bind="attrs" v-on="on" style="z-index: 20" @click="openDialog(instrument)">
                            <v-icon class="material-icons">mdi-information-variant</v-icon>
                          </v-btn>
                        </template>
                      </v-tooltip>
                    </div>
                  </transition>
                </v-img>
                <div class="instrument-name">
                  <div :class="isInstrumentsIntersecting ? 'name-big delay-1' : 'name-big delay-1 fade'">{{ instrument.vendor }}</div>
                  <div :class="isInstrumentsIntersecting ? 'name-small delay-2' : 'name-small delay-2 fade'">{{ instrument.model }}</div>
                </div>
              </v-card>
            </v-hover>
          </div>
        </div>
      </v-card>
      <div class="faq">
        <div class="faq-title ma-0">FAQ</div>
        <div class="questions text pa-0">
          <div class="question-container" v-for="faq in faqs">
            <div class="q-div">{{ faq.question }}</div>
            <div>{{ faq.answer}}</div>
          </div>
        </div>
      </div>
    </main>
    <v-dialog v-model="dialog" width="500" >
      <v-card class="text-right pa-2">
        <v-btn plain icon @click="dialog = false"><v-icon>mdi-close</v-icon></v-btn>
        <v-list-item three-line>
          <v-list-item-content style="margin-top: -45px;">
            <div class="text-overline text-left">
              Launched in {{ instrument.date_launched }}
            </div>
            <v-list-item-title class="text-h5 mb-1 text-left">
              {{ instrument.vendor +' '+instrument.model }}
            </v-list-item-title>
            <v-list-item-subtitle class="text-left" style="font-style: italic; font-size: 22px; overflow: visible; display: flex;">"{{instrument.description}}"</v-list-item-subtitle>
            <v-list-item-subtitle class="text-left" style="font-size: 16px; color: white; font-weight: 600; overflow: visible; display: flex;">Used by: {{instrument.used_by}}</v-list-item-subtitle>
          </v-list-item-content>
        </v-list-item>
      </v-card>
    </v-dialog>
  </div>
</template>
<script>
module.exports = {
  methods: {
    openDialog(instrument) {
      this.instrument = instrument;
      this.dialog = true;
    },
    onInstrumentsIntersect (entries, observer) {
      this.isInstrumentsIntersecting = entries[0].isIntersecting
    },
    onTeamIntersect (entries, observer) {
      this.isTeamIntersecting = entries[0].isIntersecting
    },
    onBoxesIntersect (entries, observer) {
      this.isBoxesIntersecting = entries[0].isIntersecting
    },
    onAboutIntersect (entries, observer) {
      this.isAboutIntersecting = entries[0].isIntersecting
    },
    onIntersect (entries, observer) {
      this.isIntersecting = entries[0].isIntersecting
    },
  },
  data: vm => ({
    instruments: [
      { vendor: "Roland", model: "CR-78", img: "./img/instruments/drum_cr78.png", date_launched: "1978", used_by: "Radiohead, Paul McCartney, Moby, Jean Michel Jarre, Phil Collins.", description: "Although primitive by later standards, the CR-78 represented an important advance in drum machine technology at the time, in particular by allowing users to program and store their own drum patterns." },
      { vendor: "Linn Drum", model: "LM-1", img: "./img/instruments/drum_linndrum.png", date_launched: "1980", used_by: "Prince, Michael Jackson, Daft Punk, Gary Numan, Icehouse, Jean Michel Jarre, Sting, Moby, Air.", description: "It was the first drum machine to use samples of acoustic drums, and one of the first programmable drum machines. The LM-1 was succeeded in 1982 by the LinnDrum." },
      { vendor: "AKAI", model: "MPC2000", img: "./img/instruments/drum_mpc2000.png", date_launched: "1988", used_by: "Kanye West, Damon Albarn, Underworld, Eminem, Madlib, J Dilla.", description: "The Akai MPC is a series of music workstations produced by Akai from 1988 onwards. It combines sampling and sequencing functions. The MPC had a major influence on the development of electronic and hip hop music" },
      { vendor: "Roland", model: "TR-606", img: "./img/instruments/drum_tr606.png", date_launched: "1981", used_by: "John Frusciante, Daft Punk, Josh Klinghoffer, Prince, Justice, Boys Noize, Moby, The Chemical Brothers.", description: "A monophonic analog bass synthesizer, to provide a simple drum and bass accompaniment to guitarists without backing bands." },
      { vendor: "Roland", model: "TR-707", img: "./img/instruments/drum_tr707.png", date_launched: "1983", used_by: "John Frusciante, Daft Punk, Kevin Parker, Radiohead, Richie Hawtin, Carl Cox, Jamie xx, Bjork, Moby, Jean Michel Jarre.", description: "It was the first Roland drum machine with MIDI functionality, allowing it to synchronize with other devices. Though it was a commercial failure, the 909 became influential in the development of electronic dance music genres such as techno, house and acid." },
      { vendor: "Roland", model: "TB-03", img: "./img/instruments/synth_tb03.png", date_launched: "1981", used_by: "Deadmau5, Daft Punk, Nina Kraviz, Orange Juice, Phuture, Hardfloor, Josh Wink.", description: "A programmable analog synthesis drum machine. Designed to simulate bass guitars, cheap second-hand units were adopted by electronic musicians, and its \"squelching\" or \"chirping\" sound became a foundation of electronic dance music genres such as acid house, Chicago house and techno." },
      { vendor: "Korg", model: "Arp", img: "./img/instruments/synth_arpodyssey.png", date_launched: "1972", used_by: "Daft Punk, Kraftwerk, Klaus Schulz, Yanni, Ryuichi Sakamoto, Ten Walls, Gary Numan.", description: "ARP produced several versions of the Odyssey from 1972-1980. In early 2015, Korg reissued the Odyssey in cooperation with the original designer and ARP co-founder, David Friend" },
      { vendor: "Roland", model: "TR-808", img: "./img/instruments/drum_tr808.png", date_launched: "1980", used_by: "Daft Punk, Kevin Parker, Calvin Harris, Aphex Twin, Josh Klinghoffer, Prince, Kanye west, Dr. Dre.", description: "It was one of the first drum machines to allow users to program rhythms instead of using preset patterns. Unlike Linn LM-1, the 808 generates sounds using analog synthesis rather than playing samples, it also It became a cornerstone of the emerging electronic, dance, and hip hop genres." },
      { vendor: "Elektron", model: "Analog", img: "./img/instruments/synth_analog4.png", date_launched: "2012", used_by: "Alessandro Cortini, Richard Devine, Tale of Us, Amelie Lens, Fjaak.", description: "The Analog Four is a tabletop 4-voice (monophonic or polyphonic) analog synthesizer with digital controls, a programmable step sequencer and digital send effects." },
      { vendor: "Musicman", model: "Majesty", img: "./img/instruments/guitar_musicman.png", date_launched: "2018", used_by: "John Petrucci.", description: "The Majesty is the result of John Petrucci’s (Dream Theater) unwavering demand for high-performance and playability. One of the most well-balanced and innovative instruments available." },
      { vendor: "Roland", model: "TR-909", img: "./img/instruments/drum_tr909.png", date_launched: "1983", used_by: "John Frusciante, Daft Punk, Kevin Parker, Radiohead, Richie Hawtin, Carl Cox.", description: "It was the first Roland drum machine with MIDI functionality, allowing it to synchronize with other devices. Though it was a commercial failure, the 909 became influential in the development of electronic dance music genres such as techno, house and acid." },
      { vendor: "Roland", model: "JV-2080", img: "./img/instruments/synth_jv2080.png", date_launched: "1996", used_by: "Armin Van Buuren, Nicky Romero, Above & Beyond, Legowelt, Richard Barbieri, Yoko Shimomura, Mind Against.", description: "An improved version of the Roland JV-1080. Built on a sample-based synthesis architecture, the JV-2080 provides a library of on-board sample material and a semi-modular synthesis engine." },
      { vendor: "Moog", model: "Sub37", img: "./img/instruments/synth_moog37.png", date_launched: "2014", used_by: "Deadmau5, Avicii, Kevin Parker, Trent Reznor, Alan Walker, Carl Cox, Steven Wilson, Jean Michel Jarre.", description: "The Moog Sub 37 is a monophonic analog synthesizer.The synthesizer has an analog signal path and digital modulators." },
      { vendor: "Korg", model: "Polysix", img: "./img/instruments/synth_polysix.png", date_launched: "1981", used_by: "Disclosure, Tycho, Chromeo, Ólafur Arnalds, Trentemøller, S U R V I V E.", description: "The Korg Polysix (PS-6) is a six-voice programmable polyphonic analog synthesizer, Although the Polysix only had one oscillator per voice, it also featured built-in chorus, phaser and 'ensemble' effects." },
      { vendor: "Roland", model: "SH-101", img: "./img/instruments/synth_sh101.png", date_launched: "1982", used_by: "Aphex Twin, Nitzer Ebb. Erasure, Thom Yorke, Robert Smith, Charlie Puth, The Chemical Brothers, Orbital, Air, Legowelt.", description: "Though it was somewhat of a commercial failure during the time of its manufacture, it later became a staple of electronic music in the 1990s, particularly house music." },
    ],
    instrument: {
      vendor: '',
      model: '',
      img: '',
      date_launched: '',
      used_by: '',
      description: '',
    },
    faqs: [
      { question: "MusicBox Dimensions wen?", answer: "When its ready" },
      { question: "How many Dimension Boxes will be minted?", answer: "Collection of 1000 (subject to change)" },
      { question: "Who owns the rights for the music?", answer: "The owner of the NFT (MusicBox) owns any rights for both personal and commercial use." },
      { question: "Where can I mint a MusicBox?", answer: "The collection is still being worked on, once it is done our NFTs will be available for purchase through our website." },
    ],
    isInstrumentsIntersecting: false,
    isTeamIntersecting: false,
    isBoxesIntersecting: false,
    isAboutIntersecting: false,
    isIntersecting: false,
    dialog: false,
  })
}
</script>
<style>
.header{
  position: absolute;
  left: 0;
  top: 0;
  z-index: 9;
  color: white;
  font-family: 'Montserrat', sans-serif;
  font-weight: 300;
  font-size: 30px;
  width: 100%;
  padding: 0 5vw;
  margin-top: 60px;
  background: rgba(0, 0, 0, .5);
}
.header nav{
  display: grid;
  grid-template-columns: 2fr 1fr 2fr;
}
.header ul{
  list-style-type: none;
  display: flex;
  height: 100%;
  align-items: center;
  justify-content: space-between;
  max-width: 1355px;
  margin: 0 auto;
}
.header ul li:not(.logo){
  padding: 0 1vw;
  flex: 0 0 33.3333%;
  text-align: center;
}
.menu-item{

}
.logo{
  font-family: 'Megrim', sans-serif;
  text-align: center;
  font-size: 80px;
  flex: 0 0 33.3333%;
}
.line{
  background: white;
  height: 2px;
}
.social-icons{
  position: absolute;
  right: 0;
  top: 0;
  z-index: 99;
  color: #ffffff;
  padding: 15px;
}
.social-icons a{
  padding: 0 .5vh;
}

@media (max-width: 600px) {
  .logo {
    font-size: 54px;
  }

  .menu-item:not(.logo){
    display: none;
  }
  .social-icons{
    width: 100%;
    text-align: center;
    padding: .5vh;
  }
  .header{
    top: 35px;
  }
}
/*Hero*/
.hero-section{
  width: 100%;
  position: relative;
  height: 100vh;
  display: flex;
  align-content: center;
  align-items: flex-end;
  z-index: 2;
  background: #000;
}
.hero-section video,
.hero-section picture{
  width: 100%;
  position: absolute;
  left: 0;
  top: 0;
  z-index: 3;
}
.hero-section picture img{
  width: 100%;
}
.hero-titles-container{
  font-size: 15px;
  width: 100%;
  display: flex;
  flex-direction: column;
  z-index: 9;
  padding: 0 5vw;
  height: 55%;
  justify-content: space-between;
}
.hero-title{
  font-family: 'Gabriola', sans-serif;
  color: white;
  font-size: 94px;
  text-align: center;
  line-height: 0.8;
}
.hero-description{
  font-family: 'Montserrat', sans-serif;
  font-weight: 300;
  color: white;
  text-align: center;
  font-size: 30px;
  width: 100%;
  margin: 3vh 0;
}
#bg-video{
  filter: blur(1px);
}
.bg-image{
  width: 100%;
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  overflow: hidden;
  background-image: url(../../img/mixer.png);
  background-position-x: center;
  background-size: cover;
}
.bg-tint{
  width: 100%;
  height: 100%;
}
.bg-tint img{
  width: 100%;
}
@media (min-width:1921px) {
  .hero-section{
    height: calc( 1920px / 1.77 );
  }
}

@media (max-width: 600px) {
  .hero-section{
    background: transparent linear-gradient(95deg, #AA2800 0%, #44007D 100%) 0 0 no-repeat padding-box;
    display: flex;
    flex-direction: column;
  }
  .hero-section::before{
    display: block;
    top: 0;
    left:0;
    position: absolute;
    background: transparent linear-gradient(188deg, #000000 0%, #808080 100%) 0 0 no-repeat padding-box;
    mix-blend-mode: overlay;
    content: " ";
    height: 100%;
    width: 100%;
    z-index: 2;
  }
  .hero-section video{
    position: relative;
  }
  .hero-title{
    font-size: 46px;
  }
  .hero-description{
    font-size: 24px;
    margin: 25vh 0 3vh;
  }
  .hero-titles-container{
    justify-content: flex-end;
    height: auto;
    flex: 1 1;
  }
}

.about{
  position: relative;
  background: linear-gradient(180deg, rgb(110 17 17) 0%, rgb(129 129 129 / 5%) 50%, rgb(140 140 140 / 17%) 100%);
  height: 100vh;
  overflow: hidden;
}
.about img{
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100%;
}
.text-container{
  width: 50%;
  padding: 5vh;
}
.about-title, .about-text{
  color: #fff;
}
.about-title{
  font-size: 40px;
  font-family: 'Megrim', sans-serif;
  margin-bottom: 40px;
}
.about-text{
  font-family: 'Montserrat', sans-serif;
  font-weight: 300;
  font-size: 26px;
  position: relative;
  z-index: 20;
}

@media (max-width: 600px) {
  .text-container{
    width: 100%;
  }
  .about-text {
    font-size: 24px;
  }
}

.collection{
  background: rgb(53,16,107);
  background: linear-gradient(180deg, rgba(53,16,107,1) 0%, rgba(38,29,56,1) 100%);
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  overflow: hidden;
}
.boxes-container{
  display: flex;
  flex-wrap: wrap;
}
.collection-box{
  flex: 1 1;
  width: 33%;
  overflow: hidden;
  background-size: cover;
}
.collection-box img{
  width: 100%;
}
.collection-title, .text{
  color: #fff;
  max-width: 70%;
  margin: 0 auto;
}
.collection-title {
  font-size: 40px;
  padding: 5vh 0;
  text-align: center;
  font-family: 'Megrim', sans-serif;
}
.hide {
  transform: translateY(-100px) translateZ(0px);
}

.slideX {
  transform: translateX(-100vw) translateZ(0px);
}

.slideXreverse {
  transform: translateX(100vw) translateZ(0px);
}

.slideY {
  transform: translateY(100vh) translateZ(0px);
}

.delay-1 {
  transition: 1s all ease;
  transition-delay: 100ms;
}

.delay-2 {
  transition: 1s all ease;
  transition-delay: 200ms;
}

.delay-3 {
  transition: 1s all ease;
  transition-delay: 300ms;
}

.slide {
  transform: translateX(-100vw) translateZ(0px);
}

.scale {
  transform: scale(1.5) translateZ(0px);
}

.fade {
  opacity: 0;
}

.animate-slow {
  transition: 1s all ease;
}

.animate {
  transition: 0.4s all ease;
}

.text{
  font-size: 26px;
  text-align: center;
  font-family: 'Montserrat', sans-serif;
  font-weight: 300;
  padding: 5vh 0;
  line-height: inherit;
  letter-spacing: inherit;
}

@media (max-width: 600px) {
  .boxes-container{
    flex-direction: column;
  }
  .collection{
    height: auto;
  }
  .collection-box{
    width: 100%;
  }
  .text{
    font-size: 20px;
    padding: 0 0 5vh 0;
  }
}

/*Team*/
.team{
  text-align: center;
  background: rgb(16,57,84);
  background: linear-gradient(191deg, rgba(16,57,84,1) 0%, rgba(20,23,25,1) 100%);
  padding: 15vh 0;
  overflow: hidden;
}
.team-members{
  display: flex;
  width: 80%;
  margin: 0 auto;
  align-items: flex-start;
  justify-content: space-between;
  padding: 5vh;
  color: #fff;
  font-family: "Montserrat", sans-serif;
  font-weight: 300;
}
.team-title {
  font-size: 40px;
  font-family: 'Megrim', sans-serif;
  margin-bottom: 40px;
  color: white;
}
.member-img{
  width: 80%;
  margin: 0 auto;
}
.member-img img{
  width: 100%;
}
.member-name{
  font-family: "Montserrat", sans-serif;
  font-weight: 600;
  font-size: 26px;
  margin: 3vh 0;
}
.member-job-single{
  font-size: 20px;
}
@media (max-width: 600px) {
  .team{
    height: auto;
  }
  .team-members{
    width: 100%;
    flex-direction: column;
  }
  .team-member-container{
    margin-bottom: 3vh;
    overflow: hidden;
    width: 100%;
  }
}

/*Instruments*/
.instruments-container{
  background: rgb(16,83,21);
  background: linear-gradient(191deg, rgba(16,83,21,1) 0%, rgba(20,23,25,1) 100%);
  position: relative;
  padding: 10vh 0;
}
.instruments-title {
  font-size: 40px;
  font-family: 'Megrim', sans-serif;
  text-align: center;
  color: #fff;
  margin-bottom: 3vh;
}
.introductory{
  text-align: center;
  color: white;
  width: 50vw;
  margin: 0 auto;
}
.instrument{
  text-align: center;
  flex: 0 0 19%;
  text-align: -webkit-center;
}
.instruments-grid{
  display: flex;
  flex-wrap: wrap;
  grid-template-columns: repeat(5, 1fr);
  gap: 1vw;
  margin: 50px;
  justify-content: center;
  align-items: center;
}
.instrument-name{
  text-align: center;
  color: white;
  line-height: 1;
}

.instrument-name .name-big {
  font-size: 36px;
  text-transform: uppercase;
  font-family: "Montserrat", sans-serif;
  margin-bottom: 1vh;
}
.instrument-name .name-small {
  font-size: 24px;
  font-family: "Montserrat", sans-serif;
  font-weight: 300;
}

@media (max-width: 600px) {
  .instruments-grid{
    display: block;
  }
  .instrument-name .name-big{
    font-size: 40px;
  }
  .introductory{
    width: 95vw;
    font-size: 20px;
  }
}
@media (max-width: 1220px){
  .instrument{
    flex: 0 0 30%;
  }
}

/*FAQ*/
.faq{
  background: rgb(81,83,84);
  background: linear-gradient(191deg, rgba(81,83,84,1) 0%, rgba(20,23,25,1) 100%);
  color: #fff;
  text-align: center;
  padding: 15vh 0;
}
.faq-title {
  font-size: 40px;
  font-family: 'Megrim', sans-serif;
  margin-bottom: 40px;
  color: white;
}
.questions{
  font-size: 20px;
}
.question-container{
  margin: 3vh 0;
}
.q-div{
  font-family: "Montserrat", sans-serif;
  font-weight: 600;
}

.slide-fade-enter-active {
  transition: all 2s ease;
}
.slide-fade-leave-active {
  transition: all .8s cubic-bezier(1.0, 0.5, 0.8, 1.0);
}
.slide-fade-enter, .slide-fade-leave-to
  /* .slide-fade-leave-active below version 2.1.8 */ {
  transform: translateY(30px);
  opacity: 0;
}
i.material-icons {
  font-size: 1.5rem;
  color: white!important;
  position: relative;
  border-radius: 50%;
  padding: 5px;
  margin: 3px;
  box-shadow: 0 1px 3px rgba(0, 0, 0, 0.12), 0 1px 2px rgba(0, 0, 0, 0.24);
  transition: color 0.2s ease, background-color 0.2s ease, transform 0.3s ease;
  line-height: 1;
  box-sizing: content-box;
  background-color: transparent;
}

i.material-icons:after {
  content: "";
  width: 100%;
  height: 100%;
  transform: scale(0.8);
  position: absolute;
  top: -2px;
  left: -2px;
  border-radius: 50%;
  transition: all 0.3s ease;
  border: 2px solid transparent;
}

i.material-icons:hover:after {
  transform: scale(1);
  box-shadow: 10px 0 20px rgba(0, 0, 0, 0.19), 6px 0 6px rgba(0, 0, 0, 0.23);
  border: 2px solid #ffffff;
}

i.material-icons:hover {
  background-color: transparent;
  transform: rotate(90deg);
  cursor: pointer;
  box-shadow: none;
  color: #ffffff!important;
}
.material-icons.v-icon:after {
  opacity: 1;
  background-color: transparent;
  transform: scale(0.8);
  transition: all 0.3s ease;
  position: absolute;
  top: -2px;
  left: -2px;
}

.tooltip {
  background: #1e1e1e;
}

.v-image__image--contain {
  transition: opacity 0.3s;
  opacity: 1;
}
.v-image.hoverLight:hover > div.v-image__image.v-image__image--contain {
  opacity: 0.8;
}
</style>