package me.firdaus1453.footballclubmodul6.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.squareup.picasso.Picasso
import me.firdaus1453.footballclubmodul6.R
import me.firdaus1453.footballclubmodul6.model.TeamsItem
import org.jetbrains.anko.*

class MainAdapter(private val teams: List<TeamsItem>) : RecyclerView.Adapter<MainAdapter.TeamViewHolder>() {
    override fun onBindViewHolder(p0: MainAdapter.TeamViewHolder, p1: Int) = p0.bindItem(teams[p1])

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder = TeamViewHolder(TeamUI().createView(AnkoContext.create(parent.context, parent)))

    override fun getItemCount(): Int = teams.size

    class TeamViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val teamBadge: ImageView = view.find(R.id.team_badge)
        private val teamName: TextView = view.find(R.id.team_name)

        fun bindItem(teams: TeamsItem) {
            Picasso.get().load(teams.teamBadge).into(teamBadge)
            teamName.text = teams.teamName
        }

    }

}

class TeamUI : AnkoComponent<ViewGroup> {
    override fun createView(ui: AnkoContext<ViewGroup>): View {
        return with(ui) {
            linearLayout {
                lparams(width = matchParent, height = wrapContent)
                padding = dip(16)
                orientation = LinearLayout.HORIZONTAL

                imageView {
                    id = R.id.team_badge
                }.lparams {
                    height = dip(50)
                    width = dip(50)
                }

                textView {
                    id = R.id.team_name
                    textSize = 16f
                }.lparams {
                    margin = dip(15)
                }
            }
        }
    }
}

