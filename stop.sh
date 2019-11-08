#!/usr/bin/env bash
sudo kill $(ps aux | grep 'selenium' | awk '{print $2}')