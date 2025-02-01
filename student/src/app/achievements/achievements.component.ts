import { Component, OnInit } from '@angular/core';
import { DataService } from '../shared/data.service';

@Component({
  selector: 'app-achievements',
  templateUrl: './achievements.component.html',
  styleUrls: ['./achievements.component.css']
})
export class AchievementsComponent implements OnInit {
  achievements: any[] = [];

  constructor(private dataService: DataService) {}

  ngOnInit(): void {
    this.achievements = this.dataService.getAchievements();
  }
}
