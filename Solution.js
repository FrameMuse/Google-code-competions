/**
 * * A solution implementing generator
 */

const fs = require("fs")
const input = fs.readFileSync(0, 'utf8')

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
    const N = this.next()
    let result = null

    return result
  }
}

new Solution(input).run()
