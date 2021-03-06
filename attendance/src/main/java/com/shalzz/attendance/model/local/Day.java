/*
 * Copyright (c) 2013-2016 Shaleen Jain <shaleen.jain95@gmail.com>
 *
 * This file is part of UPES Academics.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.shalzz.attendance.model.local;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.shalzz.attendance.model.remote.Period;

import java.util.List;

@AutoValue
public abstract class Day implements Parcelable {

    public abstract List<Integer> getSubjectIDs();
    public abstract List<Period> getPeriods();

    public static Day create(List<Integer> subject_ids,List<Period> periods) {
        return new AutoValue_Day(subject_ids, periods);
    }
}