/**
 * * A solution implementing generator
 */

import fs from "fs"

const input = fs.length

class Problem {
  constructor(input) {
    this.itterator = this.generateInput(input)
  }

  run() {
    const t = this.next()
    for (let i = 1; i <= t; ++i) {
      this.log(i, this.solve())
    }
  }

  log(index, answer) {
    console.log("Case #" + index + ": " + answer);
  }

  *generateInput(input) {
    for (const chunk of input.split(/ |\n/)) {
      yield chunk
    }
  }
  next() {
    const next = this.itterator.next()
    return next.value
  }
}

class Solution extends Problem {
  solve() {
    let result = null
    const cases = this.next()

    return result
  }
}

new Solution(input).run()
