@Pipe({
  name: 'stylePipe' // This should be the same in the template
})
export class StylePipe implements PipeTransform {
  transform(value: string): string {
    return `<span style="
      color: blue;
      font-family: 'Arial', sans-serif;
      font-weight: bold;
      font-style: italic;
      font-size: 20px;
    ">${value}</span>`;
  }
}
