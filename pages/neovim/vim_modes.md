---
layout: Neovim
transition: slide-left
---

<template v-slot:left>

# Vim Modes

* Ideally `mode` changes the operational interaction of the edtior
* There are several modes in `vim` they are:
  1. `normal`
    * make the editor entirely un-editable just to move around your buffers
      and jump between windows
    * any commands are performed only on `normal` mode
    * allows you to perform `insert` / `replace` / `visual` / `command` modes based on your selection
  2. `insert`
    * purely for insertion

</template>

<template v-slot:right>

  3. `replace`
    * this is reverse insertion, where every keystroke replaces the word with the typed one
  4. `visual`
    * purely for selection
    * _yank_ing (means copy)
    * _delet_ing content on the buffer
  5. `terminal`
    * to execute terminal command via `bash` / `sh` / `zsh`
  6. `command`
    * explicit mode to execute `VIM` commands

</template>
