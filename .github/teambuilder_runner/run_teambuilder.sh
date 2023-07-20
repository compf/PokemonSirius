#!/bin/sh -l

gradle teamBuilder:run
git config --local user.email "actions@github.com"
git config --local user.name "Github Actions"
git checkout battlelog
git add teamBuilder/*.txt
git commit -m "added log"
git push
