---
zoom: 0.75
layout: Neovim
transition: slide-left
---

<template v-slot:left>

# VIM jargons

> `vim` / `neovim` aims on avoiding `mouse` based interaction and to keep it solely
with `keyboard` strokes, the reason is because as per statistics

## Statistics

* Studies suggest that excessive mouse usage can reduce developer productivity by 10-20% compared to keyboard-centric workflows
* Keyboard shortcuts can save developers approximately 15-30 seconds per minute of coding time
* Developers who primarily use keyboard shortcuts report 25% faster navigation and code editing speeds

## Good to know JARGONS

* `yank`
* `command`
* `keymaps`
* `register`
* `macro`(s)

</template>

<template v-slot:right>

## Jargons

* `mode`(s)
  * based on `mode` the interactivity with the `file` changes
* `motion`(s)
  * basically the movements on how VIM can enhance code-jumps
* `programming-language`(s)
  * the languages supported by VIM / NEOVIM to customize the behaviour
* `buffer`(s)
  * `buffer` is the visible portion of the editor
  * being a text editor, the basic idealogy is to be efficient and fast as possible
    so, any text editor will have the buffering done, to be efficient on what is being displayed
* `window`(s)
  * this is the entire buffer allocated on memory 
* `tab`(s)
  * its the collection of `window`(s)
* `jump`(s)
  * correlated with `motion`(s) where the jumps you make is pushed into a stack,
  later you jump back and forth between your `buffer`(s)

</template>
