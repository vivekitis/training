## Git Training

This repo is meant to be used in demonstrating git merge conflicts.

## Prepration

Install git and a visual merge tool.

For *OSX*

  * Install Homebrew

        /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"

  * Install Git

        brew install git

  * Install Beyond Compare (paid; meld is a free option, `brew install homebrew/gui/meld`)

  Install Beyond Compare (`brew cask install beyond-compare`). Launch Beyond Compare, go to the Beyond Compare menu and run Install Command Line Tools. Then:

        git config --global merge.tool bc3
        git config --global mergetool.bc3 trustExitCode true
        git config --global diff.tool bc3

## Usage notes

We're building a one-page website; multiple teams are working on this website at the same time.
Let's say the teams are page1, page2, page3 and navbar. Each team starts from the same point ("master") and then develops independently. At some point all teams raise "pull requests".

Open 2 windows (each using half the screen)

1. A terminal in which we start live-server (a simple live-reloading static web-server)

        npm install -g live-server
        live-server &

2. A browser window (automatically opened by live-server, pointing to http://localhost:8080)


